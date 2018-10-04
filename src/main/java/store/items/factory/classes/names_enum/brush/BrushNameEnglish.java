package store.items.factory.classes.names_enum.brush;



public enum BrushNameEnglish implements BrushName{



    A25(4000),A36(4001),A50(4003),A63(4004),A76(4005),A90(4006),A102(4007);

    private int code;


     BrushNameEnglish (int code){

         this.code = code;
    }

    @Override
   public int getCode() {
         return code;
    }




}
