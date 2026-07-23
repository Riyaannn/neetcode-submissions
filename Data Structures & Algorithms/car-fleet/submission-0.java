class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars=new double[position.length][2];
        Deque<Double> stack=new ArrayDeque<>();
        for(int i=0;i<position.length;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }

        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));

        for(double[] car:cars){
            if(!stack.isEmpty() && car[1]>stack.peek()){
                stack.push(car[1]);
            }
            if(stack.isEmpty()){
                stack.push(car[1]);
            }

        }
        return stack.size(); 

    }
}
