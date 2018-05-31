
public class Week7
{
    public String delDel(String str) {
        if(str.length() >= 4 && (str.substring(1, 4).equals("del"))) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }
    
    public boolean startHi(String str) {
        return str.length() >= 2 && str.substring(0,2).equals("hi");
    }
    
    public String startOz(String str) {
        String acc = "";
        if(str.length() > 0 && str.charAt(0) == 'o') {
            acc += 'o';
        }
  
        if(str.length() > 1 && str.charAt(1) == 'z') {
            acc += 'z';
        }
  
        return acc;
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n,str.length());
    }

    public boolean hasBad(String str) {
        //return (str.length() >= 3 && str.substring(0,3).equals("bad")) ||
        //   (str.length() >= 4 && str.substring(1,4).equals("bad"));
        if(str.length() >= 3) {
            if(str.substring(0,3).equals("bad")) {
                return true;
            }
        }
        if(str.length() >= 4) {
            if(str.substring(1,4).equals("bad")) {
                return true;
            }
        }
  
        return false;
    }

}