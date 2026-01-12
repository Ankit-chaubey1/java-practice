// #include<iostream>
// using namespace std;
// int main(){
// 	int n;
// 	cin>>n;
// 	int arr[n];
// 	for(int i=0;i<n;i++){
// 		cin>>arr[i];
// 	}
	
// int target;
// cin>>target;

// int left=0;
// int right=n-1;
// while(left<right){
// 	int sum=arr[left]+arr[right];
// 	if(sum==target){
// 		cout<<left<<" "<<right;
	
// 	}
// 	else if(sum<target){
// 		left++;
// 	}else{
// 		right--;
// 	}
// }
// cout<<"not found";

// }

// two sum using two pointr
// time complexity: O(n)
// space complexity: O(1)
// this code works only for sorted array

//code for two sum
int twoSum(int arr[], int n, int target) {
    int left = 0;
    int right = n - 1;
    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) {
            return left; // or return right, depending on requirement
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return -1; // not found
}