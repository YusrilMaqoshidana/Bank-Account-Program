package id.usereal.bankaccountprogram

fun main(){
    inputPengguna()

}

fun inputPengguna(){
    var bankMandiri = BankAccount("Moh. Yusril Maqoshida",5_000_000)
    println("=== Halo ${bankMandiri.accountHolder} Selamat Datang di Bank Mandiri ===")
    while (true){
        println("Jumlah Saldo\t: ${bankMandiri.balance}")
        println("Pilih transaksi :\n1. Deposite\n2. Withdraw\n3. Info Transaksi\n4. Keluar")
        val choose = readln()
        if (choose == "1"){
            print("Jumlah Deposite\n:")
            val deposite = readln().toInt()
            bankMandiri.deposite(deposite)
        }else if (choose == "2"){
            print("Jumlah Withdraw\n:")
            val withdraw = readln().toInt()
            bankMandiri.withdraw(withdraw)
        }else if (choose == "3"){
            bankMandiri.displayTransactionHistory()
        }else if (choose == "4"){
            break
        }else {
            println("Pilihan tidak valid")
        }

    }
}
