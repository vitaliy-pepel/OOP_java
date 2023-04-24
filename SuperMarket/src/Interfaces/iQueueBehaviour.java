package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);  //добавить в очередь
    void releaseFromQueue();                  //убрать из очереди
    void takeOrder();                         //забрать заказ
    void giveOrder();                         //отдать заказ
}
