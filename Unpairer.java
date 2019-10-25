public class Unpairer{

        public static void main(String args[]){
                int[] arr = new int[args.length];
                int i = 0;
                for(String s : args){
                        arr[i] = Integer.parseInt(s);
                        i++;
                }
                int res = 0;
                for(int digit : arr){
                        res ^= digit;
                }
                System.out.println(res);
        }
}
