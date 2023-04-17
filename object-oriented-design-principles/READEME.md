# OODP
## SRP
Single Responsibility Principle(单一职责原则)
- 用于控制类的粒度大小
- 类的职责要单一，不要将太多的职责放在一个类中
  - 复用性低
  - 不要把鸡蛋放在一个篮子里
## OCP
Open-Closed Principle(开闭原则)
- 对扩展打开，对修改关闭
## LSP
Liskov Substitution Principle(里氏代换原则)
- 父类能用的地方，子类一定能用
## DIP
Dependency Inversion Principle(依赖倒转原则)
- 要针对抽象编程，不要对具体编程
- 依赖注入
  - 构造注入
  - 设置注入(Java中set方法注入)
## ISP
Interface Segregation Principle(接口隔离原则)
- 和SRP类似，不能使一个接口太大，要将其细化
## CRP
Composite Reuse Principle(合成复用原则)
- 多使用关联关系，少使用继承关系
  - 继承会将基类的实现细节暴露给子类，即’白箱‘复用
  - 继承无法在运行时改变，不够灵活
## LoD
Law of Demeter(迪米特法则)
- 两个类不应直接相互作用，可通过第三方进行互动
