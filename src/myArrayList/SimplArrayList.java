package myArrayList;

/**
 * Created by Андрій on 15.07.2015.
 */
public class SimplArrayList {

    static Object [] sArrayList = new Object [1];

    private int Size;

    public SimplArrayList (){

    }

    public void addFirst ( Object obj ){
        if (sArrayList[0] == null){
            sArrayList[0] = obj;
        } else {
            Object [] cpArrayList = new Object[sArrayList.length];
            System.arraycopy(sArrayList,0,cpArrayList,0,sArrayList.length);
            sArrayList = new Object[sArrayList.length + 1];
            System.arraycopy(cpArrayList,0,sArrayList,1,cpArrayList.length);
            sArrayList[0]= obj;

        }
    }

    public void printArrayList (){

        for (int i = 0; i < sArrayList.length; i++){
            System.out.println(sArrayList[i]);
        }
    }

    public void print (Object[]data){

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }

    public void addLast ( Object obj ) {
        if (sArrayList[sArrayList.length - 1] == null) {
            sArrayList[sArrayList.length - 1] = obj;
        } else {
            Object [] cpArrayList = new Object[sArrayList.length];
            System.arraycopy(sArrayList,0,cpArrayList,0,sArrayList.length);
            sArrayList = new Object[sArrayList.length + 1];
            System.arraycopy(cpArrayList,0,sArrayList,0,cpArrayList.length);
            sArrayList[sArrayList.length-1]= obj;

        }
    }

    public void addInt ( Object obj, int idx ) {
        if (sArrayList[idx] == null) {
            sArrayList[idx] = obj;
        } else {
            Object [] cpArrayList = new Object[sArrayList.length];
            System.arraycopy(sArrayList,0,cpArrayList,0,cpArrayList.length);
            sArrayList = new Object[sArrayList.length + 1];
            System.arraycopy(cpArrayList,0,sArrayList,0,idx);
            System.arraycopy(cpArrayList,idx,sArrayList,idx+1,cpArrayList.length-idx);
            sArrayList[idx]= obj;

        }
    }

    public void remove (int idx){
        Object [] cpArrayList = new Object[sArrayList.length];
        System.arraycopy(sArrayList,0,cpArrayList,0,cpArrayList.length);
        sArrayList = new Object[sArrayList.length - 1];
        System.arraycopy(cpArrayList,0,sArrayList,0,idx);
        System.arraycopy(cpArrayList,idx+1,sArrayList,idx,cpArrayList.length-idx-1);
    }

    public void remove (Object obj){
        int k = 0;
       for (int i = 0; i < sArrayList.length; i++, k++) {
           if (obj != null && obj == sArrayList[i]) {
               remove(i);
               k--;
           }
       }  if (k == sArrayList.length){
            throw new IllegalStateException("List not has this objekt");
        }
    }

}