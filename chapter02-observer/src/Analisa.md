### ANALISA PRAKTIKUM
1. `import java.util.Vector;`: Baris ini mengimpor kelas `Vector` dari paket `java.util`, yang akan digunakan untuk menyimpan daftar pengamat (observer) dalam kelas `Channel`.
2. `interface Observer { ... }`: Ini adalah deklarasi antarmuka `Observer`, yang memiliki satu metode yaitu `receiveNotification(String msg)`. Antarmuka ini akan diimplementasikan oleh kelas `User`.
3. `interface Observable { ... }`: Ini adalah deklarasi antarmuka `Observable`, yang memiliki tiga metode yaitu `addSubscriber(User user)`, `removeSubscriber(User user)`, dan `notifyUser(String msg)`. Antarmuka ini akan diimplementasikan oleh kelas `Channel`.
4. `class User implements Observer { ... }`: Ini adalah deklarasi kelas `User` yang mengimplementasikan antarmuka `Observer`. Kelas ini memiliki satu atribut `name` untuk menyimpan nama pengguna dan metode `receiveNotification(String msg)` untuk menerima notifikasi.
5. `public void receiveNotification(String msg) { ... }`: Ini adalah implementasi metode `receiveNotification()` dari antarmuka `Observer`. Metode ini hanya mencetak pesan notifikasi yang diterima oleh pengguna.
6. `public void subscribe(Channel channel) { ... }`: Metode ini memungkinkan pengguna untuk berlangganan (subscribe) ke saluran (channel) tertentu dengan menambahkan pengguna sebagai pelanggan ke dalam daftar pelanggan saluran.
7. `public void unsubscribe(Channel channel) { ... }`: Metode ini memungkinkan pengguna untuk berhenti berlangganan (unsubscribe) dari saluran tertentu dengan menghapus pengguna dari daftar pelanggan saluran.
8. `public String getName() { ... }`: Metode ini mengembalikan nama pengguna.
9. `class Channel implements Observable { ... }`: Ini adalah deklarasi kelas `Channel` yang mengimplementasikan antarmuka `Observable`. Kelas ini memiliki atribut `name` untuk menyimpan nama saluran dan `subscribers` untuk menyimpan daftar pengamat.
10. `public void addSubscriber(User user) { ... }`: Metode ini menambahkan pengguna sebagai pelanggan ke dalam daftar pelanggan saluran.
11. `public void removeSubscriber(User user) { ... }`: Metode ini menghapus pengguna dari daftar pelanggan saluran.
12. `public void notifyUser(String msg) { ... }`: Metode ini memberi tahu semua pengamat (pengguna yang berlangganan) tentang notifikasi baru dari saluran. Metode ini mencetak pesan bahwa saluran telah memposting video baru dan mengirimkan notifikasi kepada setiap pengamat.
15. `Channel ch = new Channel("Billa Channel");`: Membuat objek `Channel` baru dengan nama "Billa Channel" dan menyimpannya dalam variabel `ch`.
16. `User user1 = new User("Wika Wika");`: Membuat objek `User` baru dengan nama "Wika Wika" dan menyimpannya dalam variabel `user1`.
17. `User user2 = new User("Jobot TV");`: Membuat objek `User` baru dengan nama "Jobot TV" dan menyimpannya dalam variabel `user2`.
18. `User user3 = new User("Jinjit Karunia");`: Membuat objek `User` baru dengan nama "Jinjit Karunia" dan menyimpannya dalam variabel `user3`.
19. `ch.addSubscriber(user1);`: Menambahkan `user1` sebagai pelanggan (subscriber) ke dalam `Channel` dengan memanggil metode `addSubscriber()`.
20. `ch.addSubscriber(user2);`: Menambahkan `user2` sebagai pelanggan ke dalam `Channel`.
21. `ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");`: Memberi tahu semua pelanggan `Channel` tentang notifikasi baru dengan pesan "Ada video baru buat anda! Jangan lupa di subscribe ya!" menggunakan metode `notifyUser()`.
22. `user3.subscribe(ch);`: Menambahkan `user3` sebagai pelanggan ke dalam `Channel` dengan menggunakan metode `subscribe()` dari objek `User`.
23. `ch.notifyUser("Video baru!");`: Memberi tahu semua pelanggan `Channel` tentang notifikasi baru dengan pesan "Video baru!" menggunakan metode `notifyUser()`.

### ANALISA TUGAS PRAKTIKUM
1. `package tugas;`: Ini adalah pernyataan package yang menempatkan kelas-kelas dalam paket `tugas`.
2. `import java.util.ArrayList;`: Mengimpor kelas `ArrayList` dari paket `java.util`, yang akan digunakan untuk menyimpan daftar pengamat (observer) dalam kelas `ShoppingCart`.
3. `import java.util.List;`: Mengimpor kelas `List` dari paket `java.util`, yang akan digunakan sebagai tipe data untuk daftar pengamat (observer) dalam kelas `ShoppingCart`.
4. `interface Subject { ... }`: Ini adalah deklarasi antarmuka `Subject`, yang memiliki tiga metode yaitu `registerObserver(Observer observer)`, `removeObserver(Observer observer)`, dan `notifyObservers()`. Antarmuka ini akan diimplementasikan oleh kelas `ShoppingCart`.
5. `interface Observer { ... }`: Ini adalah deklarasi antarmuka `Observer`, yang memiliki satu metode yaitu `update(String itemName, int quantity)`. Antarmuka ini akan diimplementasikan oleh kelas `Customer`.
6. `class ShoppingCart implements Subject { ... }`: Ini adalah deklarasi kelas `ShoppingCart` yang mengimplementasikan antarmuka `Subject`. Kelas ini memiliki atribut `observers` untuk menyimpan daftar pengamat, serta atribut `itemName` dan `quantity` untuk menyimpan nama barang dan jumlahnya.
7. `public void addItem(String itemName, int quantity) { ... }`: Metode ini digunakan untuk menambahkan barang ke dalam keranjang belanja. Saat barang ditambahkan, metode `notifyObservers()` akan dipanggil untuk memberi tahu semua pengamat tentang perubahan yang terjadi.
8. `public void registerObserver(Observer observer) { ... }`: Metode ini digunakan untuk mendaftarkan pengamat baru ke dalam daftar pengamat.
9. `public void removeObserver(Observer observer) { ... }`: Metode ini digunakan untuk menghapus pengamat dari daftar pengamat.
10. `public void notifyObservers() { ... }`: Metode ini digunakan untuk memberi tahu semua pengamat tentang perubahan yang terjadi pada subjek (dalam hal ini, keranjang belanja).
11. `class Customer implements Observer { ... }`: Ini adalah deklarasi kelas `Customer` yang mengimplementasikan antarmuka `Observer`. Kelas ini memiliki satu atribut `customerName` untuk menyimpan nama pelanggan.
12. `public void update(String itemName, int quantity) { ... }`: Implementasi dari metode `update()` dari antarmuka `Observer`. Metode ini akan dipanggil ketika ada pembaruan dari subjek, dan akan mencetak pesan tentang pesanan yang dilakukan oleh pelanggan.
13. `package tugas;`: Pernyataan package ini menempatkan kelas `Main` dalam paket `tugas`.
14. `ShoppingCart shoppingCart = new ShoppingCart();`: Membuat objek `ShoppingCart` baru dengan nama `shoppingCart`.
15. `Customer customer1 = new Customer("Alice");`: Membuat objek `Customer` baru dengan nama "Alice" dan menyimpannya dalam variabel `customer1`.
16. `Customer customer2 = new Customer("Bob");`: Membuat objek `Customer` baru dengan nama "Bob" dan menyimpannya dalam variabel `customer2`.
17. `shoppingCart.registerObserver(customer1);`: Mendaftarkan `customer1` sebagai pengamat ke dalam objek `shoppingCart` dengan menggunakan metode `registerObserver()`.
18. `shoppingCart.registerObserver(customer2);`: Mendaftarkan `customer2` sebagai pengamat ke dalam objek `shoppingCart`.
19. `shoppingCart.addItem("Laptop", 2);`: Menambahkan barang "Laptop" sebanyak 2 buah ke dalam keranjang belanja dengan menggunakan metode `addItem()` dari objek `shoppingCart`.
20. `shoppingCart.addItem("Phone", 3);`: Menambahkan barang "Phone" sebanyak 3 buah ke dalam keranjang belanja.
