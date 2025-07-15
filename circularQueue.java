class circularQueue{
    int size;
    patient[] queue;
    int front = -1;
    int rear = -1;

    public circularQueue(int size){
        this.size = size;
        queue = new patient[size];
    }

    public boolean isFull(){
        return (front == (rear+1)%size);
    }

    public boolean isEmpty(){
        return (front == -1);
    }

    public void enqueue(patient p){
        if(isFull()){
            System.out.println("Queue is full!");
            return ;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        queue[rear] = p;
        System.out.println("\nPatient added: " + p);
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Patient served: " + queue[front]);

        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1) % size;
        }
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return ;
        }
        System.out.println("\nCurrent patients in queue: {");
        int i = front;
        while(true){
            System.out.println(queue[i]);
            if(i == rear) break;
            i = (i+1) % size;
        }
        System.out.println("}");
    }
}