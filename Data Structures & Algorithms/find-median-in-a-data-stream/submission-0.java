class MedianFinder {
    ArrayList<Integer> input = new ArrayList<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        input.add(num);
    }
    
    public double findMedian() {
        input.sort(null);
        int size = input.size();
        if(size%2==0){
            for(int i=0;i<size;i++){
                if(i==size/2){
                    return (input.get(i)+input.get(i-1))/2.0;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(i==size/2)
                return input.get(i);
        }
        return 0;
    }
}
