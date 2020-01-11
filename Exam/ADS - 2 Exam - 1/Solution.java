import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Solution{

    ArrayList<String> arrli = new ArrayList<String>();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void emailList(String filename) throws Exception{
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            arrli.add(line);
        }
        scan.close();
    }
    public String name(int v) throws Exception{
        File file = new File("C:\\Users\\sravya\\Documents\\ADS\\ADS_2019501042\\ADS_2019501042\\Exam\\ADS - 2 Exam - 1\\emails.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] l = line.split(";");
            if(v==Integer.parseInt(l[0])){
                sc.close();
                return l[1];
            }
        }
        sc.close();
        return null;
        
    }
    public static void main(String[] args) throws Exception{
       
        Solution o = new Solution();
        LinearProbingHashST<Integer,Integer> obj = new LinearProbingHashST<Integer,Integer>(990000);
        o.emailList("C:\\Users\\sravya\\Documents\\ADS\\ADS_2019501042\\ADS_2019501042\\Exam\\ADS - 2 Exam - 1\\email-logs.txt");
        System.out.println(o.arrli.size());
        Digraph G = new Digraph(o.arrli.size());
        for(int i=0;i<o.arrli.size();i++){
            String s[] = o.arrli.get(i).split(",");
            String s1[] = s[0].split(" ");
            String s2[] = s[1].split(" ");
            int v= Integer.parseInt(s1[1]);
            o.arr.add(v);
            int w =Integer.parseInt(s2[2]);
            G.addEdge(v,w);
        }
        
        for(int v =0;v<o.arr.size();v++){
        int j = G.indegree(o.arr.get(v));
        obj.put(v,j);
        }
        for (int s : obj.keys()) {
            System.out.println(o.name(s) + " " + obj.get(s)); 
        }

    }
}