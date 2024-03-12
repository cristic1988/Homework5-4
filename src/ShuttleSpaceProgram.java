public class ShuttleSpaceProgram {


    public static void main(String[] args) {

        int shuttleNum = 0;
        while (shuttleNum <= 100) {
            if (shuttleNum % 4 == 0 || shuttleNum % 9 == 0) {
                shuttleNum++;
                continue;

            } else

                System.out.println("shuttle № " + shuttleNum);
            shuttleNum++;


        }


    }
}


