package polymorph5;

public class AnimalGeneric <T>{
    T data;

    public AnimalGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
