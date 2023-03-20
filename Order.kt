import java.util.Date

class Order (val id: Int, val date: Int, val member: Member)
class Member (val id: Int, val name: String, val address: Address)

class Address (val street: String, val city: String, val zipcode: Int)

fun getCityOfMemberFromOrder(order: Order?): String{
    return order?.member?.address?.city ?: "Seoul"
}

fun main() {
    val addr = Address("Daeyeong-Dong","Busan", 48434)
    val memb = Member(100, "HongGilDong", addr)
    val order = Order(200,20170530, memb)

    println(getCityOfMemberFromOrder(order))
    println(getCityOfMemberFromOrder(null))
    //
    println(order.id)
    println(order.date)
    println(memb.name)
}