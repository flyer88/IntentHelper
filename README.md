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



#### Parse Bundle

```javascript
String value = new IntentParser(getIntent()).getBundle().getString("key");
```

