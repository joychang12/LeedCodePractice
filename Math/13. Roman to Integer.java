public int romanToInt(String s) {

    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("I", 1);
    map.put("V", 5);
    map.put("X", 10);
    map.put("L", 50);
    map.put("C", 100);
    map.put("D", 500);
    map.put("M", 1000);

    int sum = 0;
    int result = 0;

    for(int i =0; i < s.length(); i++) {
        String tem = s.charAt(i) + "";
        sum = map.get(tem);
        System.out.println(sum);
        if((i != 0) && (map.get(s.charAt(i - 1)+"") < map.get(tem))) {
            sum = sum - (map.get(s.charAt(i - 1) +""))*2;

        }
        result = result + sum;
    }

    return result;

}