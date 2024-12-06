
class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        var odd = head
        var even = head?.next
        val evenHead = even

        while (even?.next != null) {
            odd?.next = odd?.next?.next
            even.next = even.next?.next

            odd = odd?.next
            even = even.next
        }

        odd?.next = evenHead

        return head
    }
}