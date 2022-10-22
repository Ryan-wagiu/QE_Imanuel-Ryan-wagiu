# summary

3 poin yang dipelajari

- Post prosesor di JMeter adalah bagian dari test plan yang merupakan sebuah aksi yang berjalan saat proses setelah dilakukan proses ini adalah proses request ke sebuah alamat web
  
- proses yang dilakukan pada post prosesor ini pada umumnya adalah untuk mengekstrak value yang didapatkan dari hasil mengakses dari sebuah alamat web seperti data-data pada Json, Section atau pada bagian respond yang lainnya
  
- beberapa aturan yang dapat digunakan untuk mengekstaksi JSON 
  - $ = root element 
  - . =child operator (object)
  - [] = cild operator (array)
  - .. = recursive descent (langsung ke objek)
  - * = wild card (all things) 
  - [start:end] = array slice operator borrowed