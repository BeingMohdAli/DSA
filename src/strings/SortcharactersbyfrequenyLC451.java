//class Solution {
//    public String frequencySort(String s) {
//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(char c : s.toCharArray()){
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        List<Character> ch = new ArrayList<>(map.keySet());
//
//        ch.sort((a,b)->map.get(b)-map.get(a));
//        StringBuilder sb = new StringBuilder();
//
//        for(char c : ch){
//            int freq = map.get(c);
//            for(int i = 0; i<freq;i++){
//                sb.append(c);
//            }
//        }
//
//        return sb.toString();
//
//
//
//
//    }
//}