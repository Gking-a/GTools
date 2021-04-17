package gtools.Managers;
public interface GManageable<Index,Content>
{
    public Content get(Index index);
    public void remove(Index i);
    public void add(Index i,Content c);
    public void replace(Index i,Content c);
}
