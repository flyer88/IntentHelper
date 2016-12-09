### IntentHelper

一个 `Intent` 的帮助类 ，用链式的方式对 `intent` 和 `bundle` 进行构造。



### Usage

#### Build Intent

```java
Intent intent = new IntentBuilder()
        .putString("key","")
        .putDouble("key",0.1d)
        .buildIntent();
```



#### Build Bundle

```java
 Bundle bundle = new IntentBuilder()
           .putString("key","")
           .buildBundle();
```



#### Build And Use IntentHelper

```java
IntentHelper intentHelper = new IntentBuilder()
                .putString("key","")
                .putDouble("key",0.1d)
                .buildHelper();
intentHelper.startActivityForResult(this,1);
intentHelper.sendBroadCast(this);
```



#### Parse Bundle

```java
String value = new IntentParser(getIntent()).getBundle().getString("key");
```

