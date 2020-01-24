# Java9ModuleSample

Java 10 is used to implement module sample. java 9 can also be used.
<br/>

1.Inside BookCatalogModule Only "com.book.ref" package is exported. by this Book class is not available to other modules. As Book class is not inside com.book.ref package.<br/>
2.Inside BookCatalogTestModule - BookCatalogModule is used by which all classes are available expect Book. So, in this way class Book content cannot be changed as here BookReadOnly is only available.<br/>
