/*
* g++ -c firstlib.cpp -o firstlib.o
* ar rcs libFirstLib.a firstlib.o
* g++ main.cpp -L. -lFirstLib -o main
* ./main
*/
#include <iostream>
#include "firstLib.h"
using namespace std;
void printGreeting()
{
cout << "Welcome to C++ Library Programming" << endl;
}

void weatherForecast(int ndays)
{
if(ndays <= 3 && ndays > 0)
{
cout << "High 30" << endl;
cout << "Low 10" << endl;
cout << "30mm of predicted rainfall" << endl;
cout << "Windspeed: 2km/ph" << endl;
cout << "Wind-direction: North Easterly" << endl;
}
else
{
cout << "please enter a number that is less than or equal to 3" << endl;
}
cout << "Welcome to C++ Library Programming" << endl;
}

