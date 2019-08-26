# design patterns

java中的23中设计模式和6大原则

## 6大原则

* 开闭原则(Open Close Principle [OCP])
  
  对扩展开放,对修改关闭.意思就是尽量用继承或组合的方式来扩展类的功能,而非直接修改类代码

* 单一职责原则 (Single Responsibility Principle [SRP])
  
  不同的类具备不同的职责

* 里式代替原则(Liskov Substitution Principle [LSP])
 
  父类可以被子类替换,反之不一定成立.大概意思是子类在继承父类时务必重写父类所有方法
  
* 最少知识原则(Least Knowledge Principle [LKP])

  尽量减少对象之间的交互,从而减少类之间的耦合.低耦合、高内聚

* 接口隔离原则(Interface Segregation Principle [ISP])

  不要暴露没有实际意义的接口
  
* 依赖倒置原则(Dependence Inversion Principle [DIP])

  高层模块不应该依赖底层模块,应该依赖抽象.抽象不应该依赖细节,细节不应该依赖抽象.应该面向接口编程,不应该面向实现类编程
  
## 设计模式

### 总体来说设计模式分为三大类

* 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

* 结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

* 行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

### 整理进度

#### 创建型

- [ ] 单例模式

- [x] [工厂模式](src/main/java/com/sunny/design/mode/factory/readme.md)

#### 结构型

#### 行为型

- [x] [观察者模式](src/main/java/com/sunny/design/mode/observer/readme.md)

- [x] [模板方法模式](src/main/java/com/sunny/design/mode/templateMethod/readme.md)

- [x] [责任链模式](src/main/java/com/sunny/design/mode/chain/readme.md)
