package id.usereal.bankaccountprogram

class BankAccount(var accountHolder:String, var balance: Int) {
    private val transactionHistory = mutableListOf<String>()
    fun deposite(amount:Int){
        balance += amount
        transactionHistory.add("$accountHolder Deposite\t: $amount")
    }
    fun withdraw(amount: Int){
        if (balance < amount){
            println("Saldo anda $balance tidak cukup untuk melakukan penarikan sebesar $amount")
        }else{
            balance -= amount
            transactionHistory.add("$accountHolder Withdraw\t: $amount")
        }
    }
    fun displayTransactionHistory(){
        println("===============")
        println("Nama Nasabah\t: $accountHolder")
        println("Jumlah Saldo\t: $balance")
        println("===============")
        println()
        if (transactionHistory.size == 0){
            println("Tidak ada history transaksi")
        }else{
            for (item in transactionHistory){
                println(item)
            }
        }
        println()
        println("===============")
    }
}