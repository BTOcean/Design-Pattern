# 装饰器模式
## 是什么
装饰器模式是一种**继承关系的替代**,能够**不定义子类**且能够**动态**给对象**增加职责/功能**
## 适用情况
当使用继承方式来实现对象行为的扩展时，发现不适用（类爆炸）
## 角色构成
- component抽象组件 
  - eg：coffee行为的抽象，获取描述和获取价格
- concreteComponent具体组件
  - eg：加了咖啡豆1/2的coffee
- decorator抽象装饰者
  - 提取各个具体装饰的抽象
  - 全透明装饰者模式需要和component接口保持一致，不能将对象声明为具体构件类型或具体装饰类型
    - 不能单独调用装饰者的功能
  - 半透明和全透明相反
    - 不能多次装饰
- concreteDecorator具体装饰者
  - 具体装饰的什么
## 哪里用过
- IO流 new BufferedInputStream(new FileInputStream(inputStream)):
  - 为FileInputStream增加缓冲功能
  - InputStream为抽象组件
  - FilterInputStream为抽象装饰者
  - FilterInputStream的子类BufferInputStream...为具体装饰者
