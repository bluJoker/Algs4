package TiJ.p_194;

class Parcel4{
    // 内部类I
//    private class PContents implements Contents{
//        private int i = 11;
//
//        @Override
//        public int value() {
//            return i;
//        }
//    }

    // 内部类II
    protected class PDestination implements Destination{
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    // 非静态工厂方法
    public Destination destination(String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public Contents contents(){
        // 匿名内部类
        return new Contents(){
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
}

public class TestParcel {
    public static void main(String[] args){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        Parcel4.PDestination pp = p.new PDestination("www");
    }
}
