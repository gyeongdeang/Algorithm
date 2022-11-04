package firstweek;

import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
//        String s = bf.readLine();
//        StringTokenizer st1 = new StringTokenizer(s);
//        for(int i=0; i<road.length; i++){
//            road[i] = Long.parseLong(st1.nextToken());
//        }
//        String s = bf.readLine();
//        String arr[]=s.split("");
        //배열에서 사 둘중 하나
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write("Hello World");
            bw.flush(); // write로 담은 내용 출력 후, 버퍼를 비움.
            bw.close();

        int x = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

    }
}
