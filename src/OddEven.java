public class OddEven {
        public static void main(String[] args) {
            int count = 0;
            int maxCount = 10;
            String output = "";

            while (count < maxCount) {
                if (count % 2 == 0) {
                    output += "even,";
                } else {
                    output += "odd,";
                }
                count++;
            }
            System.out.println(output);
        }
    }

