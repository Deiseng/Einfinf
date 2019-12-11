public class Roemisch {

  public static int toArabic(String in) {
    int zahl=0;
    int i=0;
    String test="";
    if (in==test) {
      return zahl;
    }
    while(in.length()==1) {
      if(in.charAt(i)=='M') {
        zahl=zahl+1000;
        return zahl;
      }
      if(in.charAt(i)=='D') {
        zahl=zahl+500;
        return zahl;
      }
      if(in.charAt(i)=='C') {
        zahl=zahl+100;
        return zahl;
      }
      if(in.charAt(i)=='L') {
        zahl=zahl+50;
        return zahl;
      }
      if(in.charAt(i)=='X') {
        zahl=zahl+10;
        return zahl;
      }
      if(in.charAt(i)=='V') {
        zahl=zahl+5;
        return zahl;
      }
      if(in.charAt(i)=='I') {
        zahl=zahl+1;
        return zahl;
      }
    }
    while(in.charAt(i)=='M') {
      zahl=zahl+1000;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='C' && in.charAt(i+1)=='M') {
      zahl=zahl+900;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='X' && in.charAt(i+1)=='M') {
      zahl=zahl+990;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='I' && in.charAt(i+1)=='M') {
      zahl=zahl+999;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }   
    while (in.charAt(i)=='D') {
      zahl=zahl+500;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='C' && in.charAt(i+1)=='D') {
      zahl=zahl+400;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='X' && in.charAt(i+1)=='D') {
      zahl=zahl+490;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='I' && in.charAt(i+1)=='D') {
      zahl=zahl+499;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }   
    while (in.charAt(i)=='C') {
      zahl=zahl+100;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='X' && in.charAt(i+1)=='C') {
      zahl=zahl+90;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='I' && in.charAt(i+1)=='C') {
      zahl=zahl+99;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    while (in.charAt(i)=='C') {
      zahl=zahl+100;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='X' && in.charAt(i+1)=='L') {
      zahl=zahl+40;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    while (in.charAt(i)=='L') {
      zahl=zahl+50;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    } 
    while (in.charAt(i)=='X') {
      zahl=zahl+10;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    } 
    if (in.charAt(i)=='I' && in.charAt(i+1)=='X') {
      zahl=zahl+9;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    if (in.charAt(i)=='I' && in.charAt(i+1)=='V') {
      zahl=zahl+4;
      i=i+2;
      if (i>=in.length()) {
          return zahl;
        }
    }
    while (in.charAt(i)=='V') {
      zahl=zahl+5;
      i=i+1;
      if (i>=in.length()) {
          return zahl;
        }
    }
    while (in.charAt(i)=='I') {
      zahl=zahl+1;
      i=i+1;
      if (i>=in.length()) {
        return zahl;
      }
    } 
    return zahl;
  }

  public static String toRoman(int arab) {
    String roman="";
    int a= arab;
    while(a>=1000) {
      a=a-1000;
      roman=roman+"M";
    }
    while(a>=500) {
      if(a>=900) {
        roman=roman+"CM";
        a=a-900;
        break;
      }
      a=a-500;
      roman=roman+"D";
    }
    while(a>=100) {
      if(a>=400) {
        roman=roman+"CD";
        a=a-400;
        break;
      }
      a=a-100;
      roman=roman+"C";
    }    
    while(a>=50) {
      if(a>=90) {
        roman=roman+"XC";
        a=a-90;
        break;
      }
      a=a-50;
      roman= roman+"L";
    }
    while(a>=10) {
      if(a>=40) {
        roman=roman+"XL";
        a=a-40;
        break;
      }
      a=a-10;
      roman=roman+"X";
    }    
    while(a>=5) {
      if(a>=9) {
        roman=roman+"IX";
        a=a-9;
        break;
      }
      a=a-5;
      roman=roman+"V";
    }    
    while(a>=1) {
      if(a>=4) {
        roman=roman+"IV";
        a=a-4;
        break;
      }
      a=a-1;
      roman=roman+"I";
    }    
    return roman;
  }
  public static void main(String args[]) {
    int a= 999;
    String b="CMXCIX";
    System.out.println(toRoman(a)+"\n"+toArabic(b));
  }
}
