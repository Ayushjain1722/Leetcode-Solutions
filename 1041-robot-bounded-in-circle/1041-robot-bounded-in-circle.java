class Solution {
    public boolean isRobotBounded(String instructions) {
        boolean up = true;
        boolean down = false;
        boolean left = false;
        boolean right = false;
        int x = 0;
        int y = 0;
        
        for(int i=0;i<instructions.length();i++){
            char instruction = instructions.charAt(i);
            if(up){
                if(instruction=='G'){
                    y++;   
                }else if(instruction=='L'){
                    up = false;
                    left = true;
                }else if(instruction=='R'){
                    up = false;
                    right = true;
                }
            }else if(down){
                if(instruction=='G'){
                    y--;
                }else if(instruction=='L'){
                    down = false;
                    right = true;
                }else if(instruction=='R'){
                    down = false;
                    left = true;
                }
            }else if(left){
                if(instruction=='G'){
                    x--;
                }else if(instruction=='L'){
                    left = false;
                    down = true;
                }else if(instruction=='R'){
                    left = false;
                    up = true;
                }
            }else{
                if(instruction=='G'){
                    x++;
                }else if(instruction=='L'){
                    right = false;
                    up = true;
                }else if(instruction=='R'){
                    right = false;
                    down = true;
                }
            }
        }
        // System.out.println(up+" " + down+" " +left+" "+right+" " + " "+x+" "+y);
        return (!up) || (x==0 && y==0);
    }
}