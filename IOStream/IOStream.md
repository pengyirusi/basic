# I O 流

## 控制台输出

+ System.out.println()

System.java

```java
class System {
    public final static PrintStream out = null;
}
```

原来 out 是一个 PrintStream 对象，是 System 类的一个属性

println = print() + newline() = write() + newline()

对 null 有一层处理，能输出 "null" 字符串

```java
class Writer {
    /**
     * 
     * @param str
     * @param off 默认 0
     * @param len 默认 str.length()
     * @throws IOException
     */
    public void write(String str, int off, int len) throws IOException {
        // 上锁
        synchronized (lock) {
            char cbuf[];
            // 长度最小为 1024
            if (len <= WRITE_BUFFER_SIZE) {
                if (writeBuffer == null) {
                    writeBuffer = new char[WRITE_BUFFER_SIZE];
                }
                cbuf = writeBuffer;
            } else {    // Don't permanently allocate very large buffers.
                cbuf = new char[len];
            }
            str.getChars(off, (off + len), cbuf, 0);
            write(cbuf, 0, len);
        }
    }
}
```

## 读写文件









