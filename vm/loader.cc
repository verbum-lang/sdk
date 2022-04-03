
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

#include "configuration.h"
#include "loader.h"

using namespace verbum;

verbum_loader::verbum_loader (int pargc, const char **pargv) 
{
    this->argc  = pargc;
    this->argv  = pargv;

    // Verificações iniciais.
    size_t size = sizeof(char) * (strlen(argv[1]) + 1);
    char *fname = (char *) malloc(size);
    char *cname = (char *) argv[1];

    if (!fname) {
        std::cout << "Error alloc memory." << std::endl;
        exit(0);
    }

    memset(fname, 0x00, size);
    memcpy(fname, cname, size);

    std::ifstream f(fname);
    if (!f.good()) {
        std::cout << "Error open file: " << std::string(fname) << std::endl;
        exit(0);
    }

    // Carrega path completo do arquivo.
    char path [1024];
    realpath(fname, path);
    this->file_path = std::string(path);

    free(fname);

    // Carrega arquivo de código.
    this->read_source_code();

    // Formata informações.
    this->prepare_file_informations();

    #ifdef DBG
        std::cout << "File path: "      << this->file_path << std::endl;
        std::cout << "Total size: "     << this->total_bytes << std::endl;
        std::cout << "Total lines: "    << this->total_lines << std::endl;
        std::cout << "File content:"    << std::endl;

        for (auto i: this->file_content)
            std::cout << i;
        std::cout << std::endl << std::endl;
    #endif
}

void verbum_loader::read_source_code () 
{
    std::ifstream infile(this->file_path);

    infile.seekg(0, infile.end);
    size_t length = infile.tellg();
    infile.seekg(0, infile.beg);

    if (length > 0) {
        this->file_content.resize(length);    
        infile.read(&this->file_content[0], length);
    }
}

void verbum_loader::prepare_file_informations ()
{
    this->total_bytes = this->file_content.size();
    this->total_lines = 0;

    for (auto i: this->file_content)
        if (i == '\n')
            this->total_lines++;
}

// Getters (public interface).
std::string verbum_loader::get_file_path            () { return this->file_path;     }
std::vector<char> verbum_loader::get_file_content   () { return this->file_content; }
int verbum_loader::get_file_size                    () { return this->total_bytes;  }
int verbum_loader::get_total_lines                  () { return this->total_lines;  }


