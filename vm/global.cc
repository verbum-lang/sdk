
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>
#include <fstream>

#include "configuration.h"
#include "global.h"

using namespace verbum;
using namespace std;

string verbum_global::trim (string str)
{
    string newStr = "";
    bool flag = false;
    int a = 0;

    for (auto a : str) {
        if (a == ' ' && !flag) 
            continue;
        else 
            flag = true;

        newStr += a;
    }

    for (a=newStr.length()-1; a>=0; a--) {
        if (newStr[a] == ' ') 
            continue;
        else
            break;
    }

    newStr = newStr.substr(0, a+1);

    return newStr;
}


