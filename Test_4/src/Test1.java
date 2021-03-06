import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
//        CosmeticManager cm = new CosmeticManager();
//        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
//        cm.add(new Cosmetic("香奈儿","进口",800));
//        cm.add(new Cosmetic("大宝","国产",20));
//        cm.add(new Cosmetic("郁美净","国产",5));
//        cm.show();

//        SortCosmeticManager cm = new SortCosmeticManager();
//        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
//        cm.add(new Cosmetic("香奈儿","进口",800));
//        cm.add(new Cosmetic("大宝","国产",20));
//        cm.add(new Cosmetic("郁美净","国产",5));
//        cm.show();
        TypeCosmeticManager cm = new TypeCosmeticManager();
        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
        cm.add(new Cosmetic("香奈儿","进口",800));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.add(new Cosmetic("郁美净","国产",5));
        cm.show();

    }
}
class TypeCosmeticManager extends CosmeticManager{
    public void show(){
//        Cosmetic[] css = new Cosmetic[cs.length];
////        for (int i = 0; i < count; i++) {
////                if (cs[i].getType()=="进口") {
////                    css[i]=cs[i];
////                }
////        }
////        for (Cosmetic c:css
////             ) {
////            if (null!=c)
////                c.print();
////        }
//            Cosmetic[] css = Arrays.copyOf(cs,cs.length);
//            for (int i = 0; i < count; i++) {
//                if(css[i].getType()=="进口"){
//                    css[i].print();
//                }
//            }
        for (Cosmetic c:cs) {
            if(null!=c){
                if(c.getType().equals("进口")){
                    c.print();
                }
            }
        }
    }
}

class SortCosmeticManager extends CosmeticManager{
    public void show(){
        //单价升序
        Cosmetic[] css = Arrays.copyOf(cs,cs.length);
        for(int i=0;i<count;i++){
            for(int j=i;j<count;j++){
                if(css[i].getPrice() > css[j].getPrice()){
                    Cosmetic temp = css[i];
                    css[i] = css[j];
                    css[j] = temp;
                }
            }
        }
        for (Cosmetic c:css) {
            if(null != c){
                c.print();
            }
        }
    }
}
class CosmeticManager{
    protected Cosmetic[] cs = new Cosmetic[5];
    protected int count = 0;

    public void add(Cosmetic c){
        if(this.cs.length == this.count){
            int len = this.cs.length*2;
            cs = Arrays.copyOf(cs,len);
        }
        cs[count] = c;
        count++;
    }

    public void show(){
        for (Cosmetic c:cs) {
            if(null != c){
                c.print();
            }
        }
    }

}

class Cosmetic{
    private String name;
    private String type;
    private int price;
    public Cosmetic(String name,String type,int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println(this.name+","+this.type+","+this.price);
    }
}
