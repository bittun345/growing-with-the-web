package com.growingwiththeweb.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class BinaryHeapTest extends BaseHeapTest {
    @Before
    @Override
    public void setUp() {
        heap = new BinaryHeap<Integer>();
    }
}
