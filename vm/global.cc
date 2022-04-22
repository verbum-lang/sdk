
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

#include "configuration.h"
#include "global.h"

using namespace verbum;
using namespace std;

string verbum_global::trim (string str) {
    string newstr = "";
    bool flag = false;
    int a = 0;

    for (auto a : str) {
        if (a == ' ' && !flag) 
            continue;
        else 
            flag = true;

        newstr += a;
    }

    for (a=newstr.length()-1; a>=0; a--) {
        if (newstr[a] == ' ') 
            continue;
        else
            break;
    }

    return newstr.substr(0, a+1);
}

string verbum_global::remove_newlines (string str) {
    string newstr = "";

    for (auto a : str) {
        if (a == '\n' || a == '\r') 
            newstr += " ";
        else
            newstr += a;
    }

    return newstr;
}


