package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Aziz"
    val namaBelakang = " Zarkasyi Ramadhan"
    val umur = 21
    val status = "single"
    print("nama : "+namaDepan+namaBelakang+"\numur : "+umur+"\nstatus : "+status+"\n")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<String?> {
    val groupMembers = listOf(
        "Nova Safira",
        "Adelia Rosa",
        "Isep Irmansyah",
        "Aziz Zarkasyi",
        "Muhamad Irpan",
        "Berliyan Sri Surani",
        "Akhmad Nuryasin",
        "Ahmad Andre Alfiansyah",
        "Sugiharto",
        "Rizq Arya Muzaky")


    val myName = groupMembers.find { it == "Aziz Zarkasyi" }

    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf(
        "Ayat","Reza","Widia"
    )
    val countOfGroup = mentor.size + myTeam().size

    return countOfGroup
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Fantastic Ten", listOf(
        "Nova Safira",
        "Adelia Rosa",
        "Isep Irmansyah",
        "Aziz Zarkasyi",
        "Muhamad Irpan",
        "Berliyan Sri Surani",
        "Akhmad Nuryasin",
        "Ahmad Andre Alfiansyah",
        "Sugiharto",
        "Rizq Arya Muzaky"), "Morning")

}