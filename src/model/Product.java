package model;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Product {

    // CLASS FIELDS

    ObservableList<Part> associatedParts;
    protected int id;
    protected String name;
    protected double price;
    protected int stock;
    protected int min;
    protected int max;

    // CONSTRUCTERS

    public Product() {

    }

    public Product(ObservableList<Part> associatedParts, int id, String name, double price, int stock, int min, int max) {
        this.associatedParts = associatedParts;
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    // GETTERS AND SETTERS

    /**
     *
     * @return
     */
    public ObservableList<Part> getAssociatedParts() {
        return associatedParts;
    }

    /**
     *
     * @return
     */
    public void setAssociatedParts(ObservableList<Part> associatedParts) {
        this.associatedParts = associatedParts;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @return
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     *
     * @return
     */
    public int getMin() {
        return min;
    }

    /**
     *
     * @return
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     *
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     *
     * @return
     */
    public void setMax(int max) {
        this.max = max;
    }

    // INSTANCE METHODS

    public void addAssociatedPart(Part part) {

    }

    public boolean deleteAssociatedPart(Part selectAssociatedPart) {
        return false;
    }

//    public ObservableList<Part> getAllAssociatedParts() {
//        ObservableList<Part> associatedParts = new ObservableList<Part>() {
//            @Override
//            public void addListener(ListChangeListener<? super Part> listChangeListener) {
//
//            }
//
//            @Override
//            public void removeListener(ListChangeListener<? super Part> listChangeListener) {
//
//            }
//
//            @Override
//            public boolean addAll(Part... parts) {
//                return false;
//            }
//
//            @Override
//            public boolean setAll(Part... parts) {
//                return false;
//            }
//
//            @Override
//            public boolean setAll(Collection<? extends Part> collection) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Part... parts) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Part... parts) {
//                return false;
//            }
//
//            @Override
//            public void remove(int i, int i1) {
//
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Part> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Part part) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Part> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends Part> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Part get(int index) {
//                return null;
//            }
//
//            @Override
//            public Part set(int index, Part element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, Part element) {
//
//            }
//
//            @Override
//            public Part remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<Part> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<Part> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Part> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//
//            @Override
//            public void addListener(InvalidationListener invalidationListener) {
//
//            }
//
//            @Override
//            public void removeListener(InvalidationListener invalidationListener) {
//
//            }
//        }
//
//        return  associatedParts;
//    }
}
