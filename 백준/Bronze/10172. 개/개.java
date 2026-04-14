import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        sb.append("|\\_/|\n");
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|\n");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}