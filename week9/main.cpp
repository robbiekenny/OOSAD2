#include <iostream>
#include "firstLib.h"
using namespace std;
int main()
{
printGreeting();
int numDays;
cout << "please enter the number of days you wish to see the forecast for(1-3)" << endl;
cin >> numDays;
weatherForecast(numDays);
return 0;
}
