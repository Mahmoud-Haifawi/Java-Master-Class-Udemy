package oop.Composition.Exmples;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
public class WeakReferenceExmaple {

    class ImageCache {
        private final Map<String, byte[]> cache = new HashMap<>();

        public void put(String key, byte[] image) {
            cache.put(key, image); // strong reference → never collected
        }

        public byte[] get(String key) {
            return cache.get(key);
        }
    }


    class ImageCache2 {
        private final Map<String, WeakReference<byte[]>> cache = new HashMap<>();

        public void put(String key, byte[] image) {
            cache.put(key, new WeakReference<>(image));
        }

        public byte[] get(String key) {
            WeakReference<byte[]> ref = cache.get(key);
            return (ref != null) ? ref.get() : null;
        }
    }

}
