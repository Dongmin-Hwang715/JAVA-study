package java_09_기본;

public class Product<K, M> {
    public K kind;
    public M model;

    public void setKind(K kind){
        this.kind = kind;
    }

    public void setModel(M model){
        this.model = model;
    }

    public K getKind(){
        return kind;
    }

    public M getModel(){
        return model;
    }
}
