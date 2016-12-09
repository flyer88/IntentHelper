### IntentHelper

一个 `Intent` 的帮助类 ，用来链式的使用 `intent` 的构造，`bundle` 的构造。



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



#### Build IntentHelper

```java
IntentHelper intentHelper = new IntentBuilder()
                .putString("key","")
                .putDouble("key",0.1d)
                .buildHelper();
```



#### use IntentHelper

```java
intentHelper.startActivityForResult(this,1);
intentHelper.sendBroadCast(this);
```



#### Parse Bundle

```javascript
String value = new IntentParser(getIntent()).getBundle().getString("key");
```

