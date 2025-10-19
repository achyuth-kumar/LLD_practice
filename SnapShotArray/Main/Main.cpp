#include<bits/stdc++.h>
using namespace std;
unordered_map<int,vector<pair<int,int>>> mpp;
void SetValue(int index, int val,int &count) {
    pair<int,int> p;
    p.first=count;
    p.second=val;
    mpp[index].push_back(p);
    count+=1;
}

int snap(int &count) {
    int snap_id=count>0 ? (count-1) : 0;
    vector<pair<int,int>> res=mpp[snap_id];
    for(auto i : res) {
        if(i.first==snap_id) {
            return i.second;
        }
    }
    return -1;
}

int GetValue(int index, int snap_id) {
    vector<pair<int,int>> v=mpp[index];
    for(auto p : v) {
        if(p.first==snap_id) {
            return p.second;
        }
    }
    return -1;
}
int main() {
    int count=0;
    SetValue(0,5,count);
    cout<<"snap : "<<snap(count)<<endl;
    SetValue(0,6,count);
    cout<<"get : "<<GetValue(0,0)<<endl;
    return 0;
}


