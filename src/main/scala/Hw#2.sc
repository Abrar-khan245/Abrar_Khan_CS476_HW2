//example definitions of a class
Class("Base")
Class("Derived", Extends(Class("Base")))
Extends(Class("Derived"), Class("Base"))

//example declaration of class variables
Class("Derived", List(ClassVar("v1", VarType("int")), ClassVar("v2", VarType("string")))

  //example definition of class methods
  Method(Class("Base"), MethodName("m1"), List(Parameter("p1", ParamType("int")), Parameter("p2", ParamType("string"))), List(Assign(Variable("somevar"), Add(Variable("var"), Macro("someName"))), Let(Assign(Variable("var2"), Add(Variable("var"), Macro("someName")))) In Add(Variable("var2"), Value(1))))

//example of the instantiation of a class
val instance = CreateNew(Class("Derived"))

//example of the invocation of a method
val result = instance.InvokeMethod("m1", List(("p1", 1), ("p2", "howdy!"))

  //examples of defining nested classes
  Class("Base", Class("Nested"))
  Class("Derived", Class("Inner1st", Class("Inner2nd")))