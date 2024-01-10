package bluemarble.entity.goldenkey;

import bluemarble.ifs.GoldenKey;

public class Movement extends GoldenKey {
    int increment;

    public Movement() {}

    public Movement(int increment) {
        this.increment = increment;
    }
}
