package com.ankit;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int Size){
        super(Size);
    }
    public boolean push(int item){
        if(isFull()){
            int []temp = new int[2*data.length];
            for(int i =0;i< data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
