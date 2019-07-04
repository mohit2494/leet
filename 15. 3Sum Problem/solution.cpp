class Solution {

	// we'll be returning a vector of vectors
	vector<vector<int>> threeSum(vector<int> &num) {
		
		vector<vector<int>> res;
		std::sort(num.begin(),num.end());

		for(int i=0; i<num.size();i++) {
			
			int target = -num[i];
			front = i+1;
			back = num.size()-1;	
			/*
			For example,a sorted array a<b<c, the aim is -a=b+c
			if the target -a<0, then a>0. so b+c<0. But 0<a<b<c, so b+c<0 is impossible.
			*/
			
			if (target < 0) {
				break;
			}

			while (front < back) {
				
				int sum = num[front] + num[back];

				if (sum < target) {
					front++;
				}
				else if (sum > target) {
					back--;
				}
				else {
					vector<int> triplet(3,0);
					triplet[0] = num[i];
					triplet[1] = num[front];
					triplet[2] = num[back];
					res.push_back(triplet);

					/** really liked the following step **/
					
					// Processing duplicates of Number 2
					// Rolling the front pointer to the next different number forwards
					while(front < back && num[front] == triplet[1]) front++;

					// Processing duplicates of Number 3
					// Rolling the back pointer to the next different number backwards
					while(front < back && num[back] == triplet[2]) back--;
				}
			}

			// Processing duplicates of Number 1
			while(i+1 < num.size() && num[i+1] == num[i])
				i++;
		}
		return res;

	}
