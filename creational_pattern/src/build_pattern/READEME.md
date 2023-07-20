# Build Pattern
## Slove Question
- 复杂对象的创建：分步且指定顺序的创建复杂对象
  - 当对象的属性有些是可选的（**四个构造参数以上且参数可选**），可以提取出来交给具体Build（提供材料）和Director（指定顺序）
- 封装复杂对象的创建**过程和细节**
## Roles
- Abstract Builder:抽象构建者
  - 定义所有构建者的所有构建方法的定义
- Concrete Builder:
  - 提供构建**产品的材料**
- Director
  - 控制构建**产品的步骤**
- Product
  - 具体产品
