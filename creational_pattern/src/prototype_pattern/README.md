# Prototype Pattern
- Java语言中含有天然的 Clonealbe的原型模式
  - 通过实现Cloneable接口表明可克隆的特性，利用Object中的clone()方法进行克隆
- 浅拷贝：对于对象中的对象引用，并不进行拷贝，即拷贝出来的对象共享其对象引用成员变量
- 深拷贝：对象的对象引用成员变量也进行拷贝
  - 实现方法： 
    1. 对象的对象引用变量也需要实现Clonealbe接口，也需要重写Object中clone方法
    2. 使用序列化和反序列化技术，二者都需要实现Serializable接口
