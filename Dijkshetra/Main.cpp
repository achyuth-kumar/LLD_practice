#include<bits/stdc++.h>
using namespace std;
// User Function Template
    vector<int> dijkstra(int n, vector<vector<int>> &edges, int src) {
        // Code here
        vector<vector<pair<int,int>>> adj(n);
        for(auto i : edges) {
            int u=i[0],v=i[1],w=i[2];
            adj[u].push_back({w,v});
            adj[v].push_back({w,u});
        }
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> pq;
        vector<int> dist(n,INT_MAX);
        pq.push({0,src});
        dist[src]=0;
        while(!pq.empty()) {
            pair<int,int> p=pq.top();
            pq.pop();
            int dis=p.first;
            int node=p.second;
            for(auto & it : adj[node]) {
                int edgeWeight=it.first;
                int adjNode=it.second;
                if((dis+edgeWeight)<dist[adjNode]) {
                    dist[adjNode]=dis+edgeWeight;
                    pq.push({dist[adjNode],adjNode});
                }
            }
        }
        return dist;
    }
    int main() {
        int n=3;
        vector<vector<int>> edges;
        edges.push_back({0,1,1});
        edges.push_back({1,2,3});
        edges.push_back({0,2,6});
        int src=2;

        vector<int> dist=dijkstra(n,edges,src);
        for(auto i : dist) {
            cout<<i<<" ";
        }
        cout<<endl;
        return 0;
    }

