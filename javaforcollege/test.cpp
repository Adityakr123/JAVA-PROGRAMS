#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class declaration{        // The class
  public:
    int size;
    void takingsize(){
        cin>>size;
    }  
    int arr[100];            
    void arrayinitialization() {  // Method/function defined inside the class
        
       for(int i=0;i<size;i++){
            cin>>arr[i];
        }
        
    }
};
class functio :public declaration{
    public:
        void workingfunc(int a){
            cout<<arr[a];
        }
};
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */     int n,q;
    cin>>n>>q;
    
    functio obj[n]; 
    for(int i=0;i<n;i++){
        obj[i].takingsize();
        obj[i].arrayinitialization();
    }
    for(int i=0;i<q;i++){
        int b,c;
        cin>>b>>c;
        obj[b].workingfunc(c);
    }
    return 0;
}
