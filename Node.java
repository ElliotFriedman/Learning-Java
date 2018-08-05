/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author ElliotFriedman
 */
class Node<E>
{
    E element;
    Node<E> next;

    public boolean isEmpty(){
        if (element == null)
            return true;
        return false;
    }
    public Node(E e)
    {
        element = e;
    }
}
